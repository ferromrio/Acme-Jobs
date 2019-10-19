
package acme.entities.fernandezBulletin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FernandezBulletin extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				author;
	@NotBlank
	private String				text;
	@NotBlank
	private String				country;
	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

}