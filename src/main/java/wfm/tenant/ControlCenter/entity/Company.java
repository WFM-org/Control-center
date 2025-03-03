package wfm.tenant.ControlCenter.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.UUID;

@Getter
@Setter
@Entity
@Data
@Table(name = "company")
public class Company {
    @Id
    @ColumnDefault("gen_random_uuid()")
    @Column(name = "internal_id", nullable = false)
    private UUID id;

    @Column(name = "tenant", nullable = false)
    private UUID tenant;

    @NotNull(message = "External Id can not be null")
    @Column(name = "external_id", nullable = false, length = 16)
    private String externalId;

    @NotNull(message = "Name can not be null")
    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "default_language_pack", nullable = false)
    private LanguagePack languagePackDefault;

    @Column(name = "record_status", length = 64)
    private Short recordStatus;

}