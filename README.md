# TeachMeSkills_C27_Lesson_18_HW

## Homework for lesson #18

### 1. **Task #1**

App generates `List<Integer>` filled by random values from `0` to `20`.  
Using `Stream` app:
1. provides only distinct values;
2. provides only even elements within `7 - 17` range;
3. provides list with multiplied by `2` elements;
4. provides sorted first 4 elements;
5. provides count of stream elements;
6. provides average of all elements in stream;

App contains:
- **"ListFactory"** class generates `List<Integer>` filled by random values from `0` to `20`;  
- **"ListService"** class implements required tasks (mentioned above);
- **"Runner"** get default list, prints it and calls all methods from **"ListService"** class.

---

### 2. **Task #2**

App generates `List<String>` filled by names of all C27-onl group students.  
Using `Stream` app:
1. filter all names which starts with `a` (case ignored);
2. sort all collection and provide first element;

App contains:
- **"ListFactory"** class generates `List<String>` filled by names of all C27-onl group students;
- **"ListService"** class implements required tasks (mentioned above);
- **"Runner"** get default list, prints it and calls all methods from **"ListService"** class.