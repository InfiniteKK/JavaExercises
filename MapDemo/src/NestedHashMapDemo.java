import java.util.*;

public class NestedHashMapDemo {
    /*
    *** HashMap如果Key为自定义类型，为保证一致性必须重写HashCode（）和Equals（）方法。
        下面代码为Key自定义+嵌套HashMap的遍历
     */
    public static class ClassInfo{
        private String name;
        private String info;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public ClassInfo() {
        }

        public ClassInfo(String name, String info) {
            this.name = name;
            this.info = info;
        }

        @Override
        public String toString() {
            return "classInfo{" +
                    "name='" + name + '\'' +
                    ", info='" + info + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClassInfo classInfo = (ClassInfo) o;
            return Objects.equals(name, classInfo.name) &&
                    Objects.equals(info, classInfo.info);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, info);
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> hashMapClass1 = new HashMap<String, String>();
        hashMapClass1.put("100001","Tom");
        hashMapClass1.put("100002","Tony");
        HashMap<String,String> hashMapClass2 = new HashMap<String, String>();
        hashMapClass2.put("200001","Tina");
        hashMapClass2.put("200002","Lily");
        HashMap<String,String> hashMapClass3 = new HashMap<String, String>();
        hashMapClass3.put("300001","Jack");
        hashMapClass3.put("300002","Jerry");

        HashMap<ClassInfo,HashMap<String,String>> nestedHashMap = new HashMap<ClassInfo, HashMap<String, String>>();
        nestedHashMap.put(new ClassInfo("Class1","JavaEE"),hashMapClass1);
        nestedHashMap.put(new ClassInfo("Class2","UI"),hashMapClass2);
        nestedHashMap.put(new ClassInfo("Class3","PHP"),hashMapClass3);

        // entrySet() 遍历nestedHashMap
        Set<Map.Entry<ClassInfo,HashMap<String,String>>> entrySet = nestedHashMap.entrySet();
        for (Map.Entry<ClassInfo,HashMap<String,String>> entry:entrySet) {
            System.out.println(entry.getKey().name+" "+entry.getKey().info);
            HashMap<String,String> hashMap = entry.getValue();
            // foreach 遍历hashMapClass x
            Set<String> keySet = hashMap.keySet();
            for (String key:keySet) {
                System.out.print(key+","+hashMap.get(key)+"; ");
            }
            System.out.println();

        }

    }

}
