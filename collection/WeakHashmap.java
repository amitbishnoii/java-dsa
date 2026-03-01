import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

// class Phone {
//     public String brand;
//     public String model;

//     public Phone(String brand, String model) {
//         this.brand = brand;
//         this.model = model;
//     }

//     @Override
//     public String toString() {
//         return "Phone [brand=" + brand + ", model=" + model + "]";
//     }
// }

class Image {
    public String name;
    public int size;
    public Image(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public String toString() {
        return "name: " + name + ", size: " + size;
    }
}

public class WeakHashmap {
    public static void main(String[] args) {
        // Phone asdf = new Phone("asdf", "asdf"); // strong reference
        // WeakReference<Phone> phoneWeakReference = new WeakReference<Phone>(new Phone("iphone", "15 pro"));

        WeakHashMap<String, Image> phoneWeakHashMap = new WeakHashMap<>();
        phoneWeakHashMap.put("car", new Image("img.jpg", 15));
        
    }

}
