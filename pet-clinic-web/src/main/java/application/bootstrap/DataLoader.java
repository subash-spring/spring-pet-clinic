package application.bootstrap;

import com.subash.petclinicdata.model.Owner;
import com.subash.petclinicdata.model.Vet;
import com.subash.petclinicdata.services.OwnerService;
import com.subash.petclinicdata.services.VetService;
import com.subash.petclinicdata.services.map.OwnerServiceMap;
import com.subash.petclinicdata.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... strings) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Subash");
        owner1.setLastName("Thapa");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Sujata");
        owner2.setLastName("Thapa");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Don");
        vet1.setLastName("Singh");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Diesel");
        vet2.setLastName("Thapa");
        vetService.save(vet2);


    }
}
