import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mob mob = new Mob();
        Meg meg = new Meg();
        Story story = new Story();


        System.out.print("主人公の名前：");
        String name = scanner.next();

        mob.setName(name);
        System.out.println(mob.getName() + "は" + meg.getName() + "に恋をしています");

        story.storyData1(meg.getName(), mob.getName());

        if (story.answer1 != 1 && story.answer1 != 2) {
            System.out.println("もう一度入力してください:");
            story.storyData1(meg.getName(), mob.getName());
        } else {
            story.storyData2(meg.getName(), mob.getName());
        }

    }

}
