package prototype;

import java.util.Objects;

/**
 * 人类
 *
 * @author zhihaoyu
 */
public class Person implements Cloneable {

    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 基因
     */
    private String gene;

    /**
     * 全参构造器
     *
     * @param name 姓名
     * @param sex  性别
     * @param gene 基因
     */
    public Person(String name, String sex, String gene) {
        this.name = name;
        this.sex = sex;
        this.gene = gene;
        System.out.println("自然人生产成功");
    }

    /**
     * 克隆方法
     */
    @Override
    public Person clone() {
        System.out.println("克隆人生产成功");
        Person clonePerson = null;
        try {
            clonePerson = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆人生产失败");
            e.printStackTrace();
        }
        return clonePerson;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return name.equals(person.name) &&
                sex.equals(person.sex) &&
                gene.equals(person.gene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, gene);
    }
}
