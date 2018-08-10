import java.util.Scanner;

public class Story {
    Scanner scanner = new Scanner(System.in);
    public int answer1 = 0;
    public int meghp = 0;

    public void storyData1(String megname, String mobname) {
        System.out.println(megname + "が二子玉駅を歩いている。");
        System.out.println(mobname + "はどうする！？");
        System.out.println("1.声をかける");
        System.out.println("2.後ろをつける");
        System.out.print("番号を入力:");
        int answer1 = scanner.nextInt();
        this.answer1 = answer1;
    }

    public void storyData2(String megname, String mobname) {
        if (answer1 == 1) {
            System.out.println(megname + "の好感度が100増えた♥");
            this.meghp += 100;
            System.out.println("現在の好感度は・・・" + this.meghp);
        } else {
            System.out.println(megname + "の好感度は０");
            this.badending(megname, mobname);
        }
        if (this.meghp == 100) {
            this.ending(megname, mobname);
        }

    }

    public void ending(String megname, String mobname) {
        System.out.println(megname + "と" + mobname + "は恋に落ちた。");
    }

    public void badending(String megname, String mobname) {
        System.out.println(megname + "は" + mobname + "を通報した。");
        System.out.println(mobname + "は出社できなかった。");

    }
}
