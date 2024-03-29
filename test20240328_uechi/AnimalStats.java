package JavaTest2.test20240328_uechi;

import java.util.ArrayList;
import java.util.List;

public class AnimalStats {
    public static void printAnimalStatistics() {
        // Animalオブジェクトのリストを作成
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("ライオン", 120.0, 190.0));
        animals.add(new Animal("ゾウ", 300.0, 6000.0));
        animals.add(new Animal("チーター", 90.0, 72.0));
        animals.add(new Animal("キリン", 500.0, 1200.0));
        animals.add(new Animal("カバ", 150.0, 1500.0));
        animals.add(new Animal("トラ", 110.0, 220.0));

        // 最大値と最小値を求める
        double maxHeight = Double.MIN_VALUE;
        double minHeight = Double.MAX_VALUE;
        double maxWeight = Double.MIN_VALUE;
        double minWeight = Double.MAX_VALUE;
        String maxHeightAnimal = "";
        String minHeightAnimal = "";
        String maxWeightAnimal = "";
        String minWeightAnimal = "";

        for (Animal animal : animals) {
            if (animal.getHeight() > maxHeight) {
                maxHeight = animal.getHeight();
                maxHeightAnimal = animal.getName();
            }
            if (animal.getHeight() < minHeight) {
                minHeight = animal.getHeight();
                minHeightAnimal = animal.getName();
            }
            if (animal.getWeight() > maxWeight) {
                maxWeight = animal.getWeight();
                maxWeightAnimal = animal.getName();
            }
            if (animal.getWeight() < minWeight) {
                minWeight = animal.getWeight();
                minWeightAnimal = animal.getName();
            }
        }

        // 結果の出力
        System.out.println("動物６頭の体重・身長を計測しました。身長と体重の最大値と最小値を出力しています。");
        System.out.println("最大身長: " + maxHeight + " cm (" + maxHeightAnimal + ")");
        System.out.println("最小身長: " + minHeight + " cm (" + minHeightAnimal + ")");
        System.out.println("最大体重: " + maxWeight + " kg (" + maxWeightAnimal + ")");
        System.out.println("最小体重: " + minWeight + " kg (" + minWeightAnimal + ")");
    }
}