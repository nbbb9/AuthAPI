package com.ywserver.authapi.base.entities;

import lombok.Getter;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "create_date", updatable = false, nullable = false)
    private LocalDateTime createDate;

    @PrePersist
    public void onPrePersist() {
        if (this.createDate == null) {
            this.createDate = LocalDateTime.now();
        }
    }

}
