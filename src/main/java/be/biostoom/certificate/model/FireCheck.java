package be.biostoom.certificate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class FireCheck {

	@Id
	@Column(name="fire_check_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private boolean alwaysFirePermit;
	
}
