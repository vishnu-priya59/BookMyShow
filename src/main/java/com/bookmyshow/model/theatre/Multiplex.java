package bookMyShow.demo.models.theatre;

public class Multiplex implements Theatre{
    @Override
    public void showDetails() {
        System.out.println("Multiplex theatre with Dolby Sound");
    }
}
