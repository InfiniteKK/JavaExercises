import java.util.HashSet;
import java.util.Objects;

public class SetDemo {
    public static class Student{
        private int age;
        private String name;

        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Student() {
        }
        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return age == student.age &&
                    Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(age, name);
        }
    }


    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Qingdao");
        hashSet.add("Beijing");
        hashSet.add("Shanghai");
        hashSet.add("Guangzhou");
        hashSet.add("Shenzhen");
        hashSet.add("Qingdao");
        for (String ele:hashSet) {
            System.out.print(ele + " ");
        }
        System.out.println();


        HashSet<Student> studentHashSet = new HashSet<Student>();
        studentHashSet.add(new Student(18,"Tom"));
        studentHashSet.add(new Student(20,"Anna"));
        studentHashSet.add(new Student(18,"Jerry"));
        studentHashSet.add(new Student(18,"Tom"));
        System.out.println(studentHashSet);

        System.out.println(studentHashSet.contains(new Student(18,"Jerry")));


    }
}
