#include <stdio.h> 
#include <stdlib.h> 
 
struct Project { 
    int expenditure; 
    int bonus; 
    int reward_penalty; 
}; 
 
int is_possible(struct Project *projects, int n, int budget) { 
    int current_budget = budget; 
    for (int i = 0; i < n; i++) { 
        int expenditure = projects[i].expenditure; 
        int bonus = projects[i].bonus; 
        int reward_penalty = projects[i].reward_penalty; 
         
        if (current_budget < expenditure) { 
            return 0; 
        } 
        current_budget += reward_penalty; 
        current_budget -= expenditure; 
        current_budget += bonus; 
        if (current_budget < 0) { 
            return 0; 
        } 
    } 
    return 1; 
} 
 
int min_perfect_budget(struct Project *projects, int n) { 
    int min_budget = 10001; 
    for (int i = 0; i < n; i++) { 
        min_budget = (min_budget < projects[i].expenditure + projects[i].reward_penalty) ? min_budget : projects[i].expenditure + projects[i].reward_penalty; 
    } 
    for (int budget = min_budget; budget <= 10000; budget++) { 
        if (is_possible(projects, n, budget)) { 
            return budget; 
        } 
    } 
    return -1; // If no valid budget found 
} 
 
int main() { 
    int n; 
    scanf("%d", &n); 
    struct Project *projects = (struct Project *)malloc(n * sizeof(struct Project)); 
     
    for (int i = 0; i < n; i++) { 
        scanf("%d %d %d", &projects[i].expenditure, &projects[i].bonus, &projects[i].reward_penalty); 
    } 
 
    int result = min_perfect_budget(projects, n); 
    printf("%d\n", result); 
 
    free(projects); 
    return 0; 
}