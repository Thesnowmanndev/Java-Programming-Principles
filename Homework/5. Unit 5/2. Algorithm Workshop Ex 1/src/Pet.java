/*
 * This program was written by Kyle Martin on 6/18/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to complete part b of Chapter 6 Algorithm Workshop Exercise 1
 * See Chapter 6 Algorithm Workshop Exercise 1
 */
public class Pet {
    private String name;
    private String animal;
    private int age;

    public void setName(String animalName) {
        name = animalName;
    }

    public void setAnimal(String animalType) {
        animal = animalType;
    }

    public void setAge(int animalsAge) {
        age = animalsAge;
    }

    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }
}
