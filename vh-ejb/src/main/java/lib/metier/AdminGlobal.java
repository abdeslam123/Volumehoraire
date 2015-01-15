package lib.metier;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GLOB")
public class AdminGlobal  extends Admin implements Serializable {
	
}
