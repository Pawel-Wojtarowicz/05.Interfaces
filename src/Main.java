import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Figure[] figures = new Figure[3];
//        figures[0] = new Circle("Koło", 12.5);
//        figures[1] = new Triangle("Trójkąt", 3.4, 8.9);
//        figures[2] = new Rectangle("Prostokąt",5,13);

        Scanner scanner = new Scanner(System.in);
        Figure[] figures = new Figure[3];
        System.out.println("Podaj promień: ");
        figures[0] = new Circle("Koło", scanner.nextDouble());
        System.out.println("Podaj 2 boki trójkąta: ");
        figures[1] = new Triangle("Trójkąt", scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Podaj 2 boki prostokąta: ");
        figures[2] = new Rectangle("Prostokąt", scanner.nextDouble(), scanner.nextDouble());

        for (Figure figure: figures) {
            System.out.println(figure.type());
            System.out.println("Pole: " + figure.getArea());
            System.out.println("Obwód: " + figure.getPerimeter() + "\n");
        }
    }
}
