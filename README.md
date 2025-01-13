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
