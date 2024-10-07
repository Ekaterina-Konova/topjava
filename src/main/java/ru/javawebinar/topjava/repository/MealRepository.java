package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealTo;

import java.util.Collection;
import java.util.List;

public interface MealRepository {
    Meal save(Meal meal);

    boolean delete(int id);

    Meal getById(int id);

    Collection<Meal> allMeals();


}
