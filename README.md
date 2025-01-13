# Answer to Questions

## Task 1
**Q1: What happens if the designers of the Storage class decide to change the implementation 
of the List to `LinkedList`?**  

A1: They would need to change the code in many places; both the client code and the code in 
Storage class. This would make the code much less flexible and harder to maintain.

---

**Q2: Think about the method calls in main - does `trimToSize()` exist in `LinkedList`?**  

A2: No it does not. 
Even though both `ArrayList` and `LinkedList` are conrecte implementations of the `List` 
interface and therefor share a common set of operations, they are not identical in their
set of methods because they each have some distinct methods of their own.

---

Q3: Should Main know about what concrete type of List `Storage` provides?  

A3: No. Main should not be dependent on a conrete type of List. Following the OOP
principles, it is better to program aginst an interface or abstract class to allow
abstraction and also lower coupling.

## Task 2
**Q1** Add UML.  
Simple UML diagram of inheritence tree:  
![image](https://github.com/user-attachments/assets/1a765f92-63f6-4956-915e-c0d3ff3812d0)  

**Q2: Is it possible in this design for an Engineer to also become a Manager?**  

A2: No, not with the current structure because a class cannot inherit from more than one class. To make this possbiel we would need to favor composition to inheritence.
"Use composition (has-a relationships) instead of inheritance (is-a relationships) in certain situations to create more flexible and maintainable code"

**Q3: Re-design the classes so that there is only one (concrete) class called Employee.**  

A3: See code in repo.

**Q4: If you want a removeRole(Role) method, how do you have to change the Role class?**  

A4: Overriden `equals()` and `hashCode()` in `Role` so that we can check if two roles
are equal. Added `removeRole()` in `Employee` that checks if the role exists in the
employees list of roles, and removes it from there if that is the case.
Result when I run the application:

```
John Doe at HR with role/s: [Administrator]

Adding a new role...
John Doe at HR with role/s: [Administrator, Team Coordinator]

Removing a role of administrator...
John Doe at HR with role/s: [Team Coordinator]
```

## Task 3
Using `Objects.requireNonNull()` for efficient null check on the `name` field in `Person2`:

    public Person2(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }
