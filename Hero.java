public class Hero implements Comparable<Hero> {
    private String name;
    private int age;
    private String home;

    public Hero() {
    }

    public Hero(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return age == hero.age && name.equals(hero.name) && home.equals(hero.home);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + ((Integer) age).hashCode();
        hash = 31 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 31 * hash + (this.home != null ? this.home.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", home='" + home + '\'' +
                '}';
    }

    @Override
    public int compareTo(Hero o) {
        return this.getAge() - o.getAge();
    }
}
