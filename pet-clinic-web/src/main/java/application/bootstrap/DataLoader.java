package application.bootstrap;

import application.model.Owner;
import application.model.Pet;
import application.model.PetType;
import application.model.Vet;
import application.services.OwnerService;
import application.services.PetTypeService;
import application.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... strings) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Subash");
        owner1.setLastName("Thapa");
        owner1.setAddress("351 turk");
        owner1.setCity("San francisco");
        owner1.setTelephone("5103567422");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Sujata");
        owner2.setLastName("Thapa");
        owner2.setAddress("Naikap");
        owner2.setCity("Kathmandu");
        owner2.setTelephone("98497411");
        ownerService.save(owner2);

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

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
