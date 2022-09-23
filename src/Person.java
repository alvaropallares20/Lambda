import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private String surname;
    private List<String> emails;

    public Person(String name, String surname, List<String> emails) {
        this.name = name;
        this.surname = surname;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    private List<String> getSurnames(List<Person> people){
        //List<String> surnames= new LinkedList<>()
        //for(Person peron : people){
         //   surname.add(peron.getSurname());
        //}
       // return surnames;
        return people
                .stream()
                .map(person -> person.getSurname())
                .collect(Collectors.toList());
    }
    private List<Person> findGarcia(List<Person> people){
        //List<String> garcias= new LinkedList<>()
        //for(Person peron : people){
        //   if(person.getSurname().equals("Garcia")){
        //garcias.add(person);
        //}
        // return garcias;
        return people
                .stream()
                .filter(person -> person.getSurname().equals("Garcia"))
                //.map(person -> person.getName())
                //para sacar el nombre de todos los garcia
                .collect(Collectors.toList());
    }
    private List<String> getEmails(List<Person> people){
        return people
                .stream()
                //para conseguir una lista de listas
                .flatMap(person -> person.getEmails().stream())
                .collect(Collectors.toList());
    }
    private int getNumberOfEmails(List<Person> people){
        return people
                .stream()
                //sumar todos los emailsde una lista
                .map(person -> person.getEmails().size())
                .reduce(0, (a,b) -> a + b);
    }
    private boolean existBobEsponja(List<Person> people){
        return people
                .stream()
                .anyMatch(person -> person.getName().equals("Bob") &&
                        person.getSurname().equals("Esponja"));

    }

}


