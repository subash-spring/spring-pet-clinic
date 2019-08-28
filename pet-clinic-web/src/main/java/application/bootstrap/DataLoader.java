package application.bootstrap;

import application.model.Owner;
import application.model.Vet;
import application.services.OwnerService;
import application.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... strings) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Subash");
        owner1.setLastName("Thapa");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Sujata");
        owner2.setLastName("Thapa");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Don");
        vet1.setLastName("Singh");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Diesel");
        vet2.setLastName("Thapa");
        vetService.save(vet2);


    }
}
