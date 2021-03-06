package spinoza.compagnie.policlinic;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import lombok.Data;

@Data
public class Consultation {

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    // tag::allButValidation[]
    private String name;
    // end::allButValidation[]
    @Size(min=1, message="You must choose at least 1  one answer")
    // tag::allButValidation[]
    private List<String>  questions;
}
