package bookMyShow.demo.models.theatre;

public class SingleScreen implements Theatre{
    @Override
    public void showDetails() {
        System.out.println("Single screen classic theatre");
    }
}
