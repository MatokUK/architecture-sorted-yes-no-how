#include <stdbool.h>

bool is_greater(int a, int b)
{
    return a > b;
}

bool is_lower(int a, int b)
{
    return a < b;
}

bool is_sorted_by(int* array, int arrayLength, bool *compare(int, int))
{
    int prev = array[0];
    
    for (int i = 0; i < arrayLength; i++) {
        if (compare(prev, array[i])) {
            printf("soon\n");
            return false;
        }
        prev = array[i];
    }
    
    return true;
}

char* isSortedAndHow(int* array, int arrayLength)
{
    if (is_sorted_by(array, arrayLength, &is_greater)) {
        return "yes, ascending";
    }
    
    if (is_sorted_by(array, arrayLength, &is_lower)) {
        return "yes, descending";
    }
    
    return "no";
}