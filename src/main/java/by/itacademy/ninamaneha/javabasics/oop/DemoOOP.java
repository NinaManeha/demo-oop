package by.itacademy.ninamaneha.javabasics.oop;

import com.github.javafaker.Faker;

public class DemoOOP {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        Faker faker = new Faker();
        Customer customer1 = new Customer(
                faker.number().numberBetween(1, 10000),
                faker.name().lastName(),
                faker.name().firstName(),
                faker.name().firstName(),
                faker.address().fullAddress(),
                faker.finance().creditCard(),
                faker.finance().iban());
        System.out.println("Customer1 full name: " + customer1.getLastName() + " " + customer1.getFirstName());
        System.out.println(customer1);

        Customer customer2 = new Customer();
        customer2.setId(faker.number().numberBetween(1, 1000));
        customer2.setLastName(faker.name().lastName());
        customer2.setFirstName(faker.name().firstName());
        customer2.setMiddleName(faker.name().firstName());
        customer2.setAddress(faker.address().fullAddress());
        customer2.setCreditCardNumber(faker.finance().creditCard());
        customer2.setBankAccountNumber(faker.finance().iban());
        System.out.println("Customer2 full name: " + customer2.getLastName() + " " + customer2.getFirstName());
        System.out.println(customer2);
        System.out.println();

        Book book1 = new Book(
                "978-5-17-102580-9",
                "К востоку от Эдема",
                "Джон Стейнбек",
                "АСТ",
                2022,
                350,
                23_50);
        System.out.println("Book 1 title: " + book1.getTitle());
        System.out.println(book1);

        Book book2 = new Book();
        book2.setId("978-5-04-122320-5");
        book2.setTitle("1984. Скотный двор");
        book2.setAuthor("Джордж Оруэлл");
        book2.setPublisher("Эксмо");
        book2.setPublicationYear(2021);
        book2.setPageCount(416);
        book2.setPrice(16_72);
        System.out.println("Book 2 title: " + book2.getTitle());
        System.out.println(book2);
        System.out.println();

        Car car1 = new Car(
                137713116,
                "BMW",
                "5 серия G30, G31 · Рестайлинг",
                2021,
                "синий",
                118603,
                "1234 АА-7"
        );
        System.out.println("Car 1 brand and model: " + car1.getBrand() + " " + car1.getModel());
        System.out.println(car1);

        Car car2 = new Car();
        car2.setId(142916393);
        car2.setBrand("Kia");
        car2.setModel("Sorento III");
        car2.setManufactureYear(2018);
        car2.setColor("чёрный");
        car2.setPrice(69660);
        car2.setRegistrationNumber("7421 МХ-7");
        System.out.println("Car 2 brand and model: " + car2.getBrand() + " " + car2.getModel());
        System.out.println(car2);

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        Person person1 = new Person(
                "Alexey Smirnov",
                150,
                1200);
        System.out.println("Person 1: " + person1);
        System.out.println("Person 1 income: " + person1.getIncome());

        Person person2 = new Person();
        person2.setName("Maria Kovaleva");
        person2.setSalary(2200);
        System.out.println("Person 2: " + person2);
        System.out.println("Person 2 income: " + person2.getIncome());
    }
}
