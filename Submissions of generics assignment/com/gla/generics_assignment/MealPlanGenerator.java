package com.gla.generics_assignment;

public class MealPlanGenerator {
    interface MealPlan {}
    static class VeganMeal implements MealPlan { public String toString() { return "Vegan Meal Plan"; } }
    
    static class Meal<T extends MealPlan> {
        T plan;
        Meal(T plan) { this.plan = plan; }
        public T getPlan() { return plan; }
    }

    public static <T extends MealPlan> Meal<T> generatePlan(T type) {
        return new Meal<>(type);
    }

    public static void main(String[] args) {
        Meal<VeganMeal> plan = generatePlan(new VeganMeal());
        System.out.println("Generated: " + plan.getPlan());
    }
}
