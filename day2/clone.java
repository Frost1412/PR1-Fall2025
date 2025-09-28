package PR1_Ver2.day2;

public class clone {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10, 15, 254, 243};
        // Lúc này array gốc sẽ được khởi tạo trước
        int[] targetArray = new int[sourceArray.length];
        // Lúc này chúng ta sẽ tạo một cái array mới copy độ dài của array cũ(Chỉ copy độ dài thooi)
        for (int i = 0; i < sourceArray.length; i++) {
            // ĐỘc qua từng giá trị một trong array suộc
            targetArray[i] = sourceArray[i];
            // Gián giá trị suộc vào array ban clonem, tu do tao ra 1 array clone lai array goc
            System.out.print(targetArray[i] + ", ");
            // in ra cac gia tri cua array da dc clone
        }

    }
}
