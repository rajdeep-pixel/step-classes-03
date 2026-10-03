import re

with open("README.md", "r") as f:
    content = f.read()

# 1. Fix ASCII tree diagram
content = content.replace("    ├── feature/session_6\n    └── feature/session_7", "    ├── feature/session_6\n    ├── feature/session_7\n    └── feature/session_8")

# 2. Branch Index
content = content.replace("| [`feature/session_7`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_7) | Week 7 — Encapsulation & Access Control | `encapsulation` | 5 | 5 |", "| [`feature/session_7`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_7) | Week 7 — Encapsulation & Access Control | `encapsulation` | 5 | 5 |\n| [`feature/session_8`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_8) | Week 8 — OOP Inheritance, Polymorphism, and Abstract Classes | `polymorphism` | 5 | 5 |")

content = content.replace("**60 Java files solved to date.**", "**70 Java files solved to date.**")

# 3. How to Run
run_block = """### Compile and run Session 8 (OOP Inheritance, Polymorphism, and Abstract Classes):
```bash
git checkout feature/session_8
javac -d out $(find src/main/java -name '*.java')

# Run Class Problems:
java -cp out polymorphism.class_problems.PaymentSystemFeeCalculation
java -cp out polymorphism.class_problems.LibraryItemDueDateCalculator
java -cp out polymorphism.class_problems.DeliveryFeeCalculator
java -cp out polymorphism.class_problems.ExaminationQuestionGrader
java -cp out polymorphism.class_problems.PublicTransportFareCalculator

# Run Assignment Problems:
java -cp out polymorphism.assigment_problems.CanteenBillingCounter
java -cp out polymorphism.assigment_problems.CampusParkingChargeCalculator
java -cp out polymorphism.assigment_problems.HostelElectricityBill
java -cp out polymorphism.assigment_problems.FestivalBonusCalculator
java -cp out polymorphism.assigment_problems.StreamingPlanRenewalReminder
```

### Compile and run Session 7"""
content = content.replace("### Compile and run Session 7", run_block)

# 4. Contents by Session
contents_block = """### Session 8 — OOP Inheritance, Polymorphism, and Abstract Classes (`polymorphism`)

#### Class Problems (`polymorphism/class_problems`)
| Type | Problem | Approach / Description |
| :--- | :--- | :--- |
| Class | `PaymentSystemFeeCalculation` | Modeled different payment methods using a common base class calculating specific fees. |
| Class | `LibraryItemDueDateCalculator` | Calculated item-specific due dates abstracting borrowing rules in derived classes. |
| Class | `DeliveryFeeCalculator` | Overridden fee calculations for standard, express, and international deliveries. |
| Class | `ExaminationQuestionGrader` | Applied distinct grading criteria via overridden `evaluate()` for MCQ, TF, and Essay. |
| Class | `PublicTransportFareCalculator` | Handled differing base and rate multipliers for Bus, Train, and Metro subclasses. |

#### Assignment Problems (`polymorphism/assigment_problems`)
| Type | Problem | Approach / Description |
| :--- | :--- | :--- |
| Assignment | `CanteenBillingCounter` | Overridden `calculateFinalAmount()` for staff, students, and guests applying respective discounts. |
| Assignment | `CampusParkingChargeCalculator` | Specific rate computations modeled via overridden methods for cars, bikes, and trucks. |
| Assignment | `HostelElectricityBill` | Modeled room specific logic including occupant splitting and flat charges in polymorphic instances. |
| Assignment | `FestivalBonusCalculator` | Implemented distinct percentage versus flat amount logic through overridden employee base class. |
| Assignment | `StreamingPlanRenewalReminder` | Validated renewal offsets uniquely overridden for Basic, Standard, and Premium subscription plans. |

**Key Concepts Covered:**
- Subtyping and runtime polymorphism using common base-type references.
- Derived classes replacing and providing specific method overrides without explicit type checking.
- Abstract classes and methods defining common interfaces and standard behaviors.
- Extending attributes in derived types to adapt inherited structures.
- Iterating heterogeneous polymorphic collections safely.

---

### Session 7"""
content = content.replace("### Session 7", contents_block)

# 5. Progress Log
log_block = """### Date: 03-10-2026 (Session 8)
**Today's Work:**
- Created and checked out new branch `feature/session_8` directly from base `develop`.
- Solved all 5 Category C Class Problems under `polymorphism/class_problems` with strictly zero comments, demonstrating run-time polymorphism.
- Solved all 5 Category C Assignment Problems under `polymorphism/assigment_problems` with strictly zero comments using abstraction and method overriding.
- Corrected input parsing edge cases using regex and string manipulation matching provided schemas precisely.
- Verified 100% test pass rate across all 10 problem suites via `main()` assertions and compiled cleanly with `javac`.
- Synchronized documentation in `README.md` across both `feature/session_8` and `main` branches.

---

### Date: 03-10-2026 (Session 7)"""
content = content.replace("### Date: 03-10-2026 (Session 7)", log_block)

with open("README.md", "w") as f:
    f.write(content)
print("Updated README.md for Session 8")
