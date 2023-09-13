public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        System.out.println(boxerOne+boxerTwo);
        System.out.println(boxerTwo-boxerOne);
        var weightВifference = boxerTwo % boxerOne;
        System.out.println(weightВifference);
        var alltime = 640;
        var onetime = 8;
        var numberOfEmployees = 640 / 8;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + numberOfEmployees * onetime + " часов работы может быть поделено между сотрудниками ");
        }
}