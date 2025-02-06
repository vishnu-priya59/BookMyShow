package bookMyShow.demo.models.theatre;

public class IMAX implements Theatre{
    @Override
    public void showDetails() {
        System.out.println("IMAX theatre");
    }
}
