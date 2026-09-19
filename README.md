# Step_semester_3

```text
main documentation only (this README)
└── develop empty Java project skeleton — never receives merges
    ├── feature/session_1
    ├── feature/session_2
    ├── feature/session_4
    ├── feature/session_5
    └── feature/session_6
```

Every session branch is cut from `develop`. Feature branches are kept separate and are never merged back, so `develop` stays a clean, empty base project all semester and each session branch is a self-contained snapshot of one week's work.

---

## Branch Index

| Branch | Week / Topic | Topic Package | Class Problems | Assignment Problems |
| :--- | :--- | :--- | :---: | :---: |
| `main` | Documentation + progress log | — | — | — |
| `develop` | Empty Java project skeleton | — | — | — |
| [`feature/session_1`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_1) | Week 1 — Java fundamentals | `string` | 5 | 5 |
| [`feature/session_2`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_2) | Week 2 — Strings | `string` | 5 | 5 |
| [`feature/session_4`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_4) | Week 4 — Functions & arrays | `arrays` | 5 | 5 |
| [`feature/session_5`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_5) | Week 5 — Arrays, Overloading & OOP Ranking Engines | `arrays` | 5 | 5 |
| [`feature/session_6`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_6) | Week 6 — Object-Oriented Programming (OOP) | `oop` | 5 | 5 |

**50 Java files solved to date.** Each session branch carries its own focused codebase with class exercises and homework assignments.

---

## Repository Layout

Inside each session branch:

```text
src/main/java/<topic>/
    class_problems/       <- problems solved during the live session
    assigment_problems/   <- problems given as take-home assignments
.gitignore                <- *.class, bin/, out/, target/, .idea/, *.iml, .vscode/, OS files
```

> **Note:** The folder name `assigment_problems` is spelled that way across every branch. It is consistent across the repository, so leave it alone unless every branch is refactored at once.

---

## How to Run

Every class has its own `main` method, so each problem runs standalone from the command line or any IDE.

### Compile and run Session 6 (Object-Oriented Programming):
```bash
git checkout feature/session_6
javac -d out $(find src/main/java -name '*.java')

# Run Class Problems:
java -cp out oop.class_problems.PlacementRecord
java -cp out oop.class_problems.MessWallet
java -cp out oop.class_problems.Course
java -cp out oop.class_problems.IdCard
java -cp out oop.class_problems.Student

# Run Assignment Problems:
java -cp out oop.assigment_problems.BookInventory
java -cp out oop.assigment_problems.PayrollAccount
java -cp out oop.assigment_problems.Employee
java -cp out oop.assigment_problems.HallTicket
java -cp out oop.assigment_problems.CompanyEmployee
```

### Compile and run Session 5 (Arrays & Object-Oriented Ranking Engines):
```bash
git checkout feature/session_5
javac -d out $(find src/main/java -name '*.java')

# Run Class Problems:
java -cp out arrays.class_problems.HackathonScoreCurveBooster
java -cp out arrays.class_problems.DuplicateTeamNameFinder
java -cp out arrays.class_problems.Top3PodiumFinder
java -cp out arrays.class_problems.HackathonSeatingGridOptimizer
java -cp out arrays.class_problems.PlacementDriveEngine

# Run Assignment Problems:
java -cp out arrays.assigment_problems.FantasyTeamScoreMultiplier
java -cp out arrays.assigment_problems.DuplicatePlayerPickChecker
java -cp out arrays.assigment_problems.TopPerformerTracker
java -cp out arrays.assigment_problems.MatchDayGridAnalyzer
java -cp out arrays.assigment_problems.FantasyLeagueAutoDraftRankingEngine
```

### Compile and run Session 4 (Functions & Arrays):
```bash
git checkout feature/session_4
javac -d out $(find src/main/java -name '*.java')
java -cp out arrays.assigment_problems.MaximumSubarray
```

### Compile and run Session 2 (Strings):
```bash
git checkout feature/session_2
javac -d out $(find src/main/java -name '*.java')
java -cp out string.class_problems.TransactionReferenceValidator
```

### Compile and run Session 1 (Java Fundamentals):
```bash
git checkout feature/session_1
javac -d out $(find src/main/java -name '*.java')
java -cp out string.class_problems.RockPaperScissors
```

---

## Contents by Session

### Session 1 — Java Fundamentals (`string`)

| Type | Problem | Approach / Description |
| :--- | :--- | :--- |
| Class | `RockPaperScissors` | 5-round simulation against computer random choice with scorekeeper. |
| Class | `PalindromeChecker` | 2-pointer iterative scan, recursive reduction, and char-array reversal. |
| Class | `BmiCalculator` | Team BMI processor with formatted wellness table. |
| Class | `UniqueLetterHunt` | First non-repeating character hunt via 256-element frequency array. |
| Class | `CustomerVerification` | Character traversal and reversed string reconstruction. |
| Assignment | `SeatDuplicationChecker` | Pairwise nested loop scan detecting duplicate seat allocations. |
| Assignment | `TypingAccuracyChecker` | Character comparison computing typing accuracy percentage. |
| Assignment | `TrafficSignalAnalyzer` | Consecutive signal state tracking for longest color streak. |
| Assignment | `InventoryBalancer` | Evaluates bin quantities against target stock to compute delta. |
| Assignment | `WordLengthProfiler` | Splits text into words, profiling and categorizing word lengths. |

---

### Session 2 — Strings (`string`)

| Type | Problem | Approach / Description |
| :--- | :--- | :--- |
| Class | `VowelConsonantCounter` | Text analyzer counting vowels and consonants using case normalization. |
| Class | `StudentRecordParser` | CSV parser tokenizing comma-delimited student records into structured output. |
| Class | `FileExtensionValidator` | Extension validator using `lastIndexOf(".")` and `substring()`. |
| Class | `PhoneNumberFormatter` | Phone number formatter masking sensitive digits. |
| Class | `TransactionReferenceValidator` | Multi-stage bank reference validator with ordered failure reasons. |
| Assignment | `AtmPinValidator` | Numeric ATM PIN validator verifying strict 4 or 6-digit length. |
| Assignment | `IsbnNormalizerValidator` | Cleans ISBN by stripping hyphens and verifying length and checks. |
| Assignment | `InventoryCsvParser` | Tokenizes multi-field inventory CSV rows with validation. |
| Assignment | `WordFrequencyReport` | Stop-word filtering and frequency counting. |
| Assignment | `WordReversalEncoder` | Individual word reversal maintaining sentence order. |

---

### Session 4 — Functions & Arrays (`arrays`)

| Type | Problem | Approach / Description |
| :--- | :--- | :--- |
| Class | `TwoSum` | Brute-force nested loop scan checking every pair `nums[i] + nums[j] == target`. |
| Class | `ContainsDuplicate` | Brute-force pairwise nested comparison checking if `nums[i] == nums[j]`. |
| Class | `MergeSortedArrays` | Two-pointer merge comparing elements with tail drain into new array. |
| Class | `RotateArray` | Index remap using `(i + k) % n` with negative offset normalization. |
| Class | `StockBuySell` | Single pass greedy tracking minimum buy price and maximum profit. |
| Assignment | `ProductExceptSelf` | Two-pass prefix products and suffix multiplier with no division. |
| Assignment | `MaximumSubarray` | Kadane's algorithm seeded with `nums[0]` for all-negative inputs. |
| Assignment | `ThreeSum` | Array sort + anchor iteration with two-pointer inward squeeze and duplicate skipping. |
| Assignment | `SubarraySumEqualsK` | Prefix sums frequency tracking with `HashMap`. |
| Assignment | `FindMinRotatedSortedArray` | Modified binary search comparing `nums[mid]` against `nums[right]`. |

---

### Session 5 — Arrays, Overloading & Ranking Engines (`arrays`)

#### Class Problems (`arrays/class_problems`)
| Type | Problem | Signature | Approach / Description |
| :--- | :--- | :--- | :--- |
| Class | `HackathonScoreCurveBooster` | `curveScores(int[], int)` | In-place score boosting without allocating new arrays; printed via `Arrays.toString()`. |
| Class | `DuplicateTeamNameFinder` | `findDuplicateTeam(String[])` | Nested-loop pairwise scanning detecting first duplicate entry without external collections. |
| Class | `Top3PodiumFinder` | `findTopThreeScores(int[])` | Single-pass $O(n)$ top-3 score extraction using 3 running cascade variables; supports score ties. |
| Class | `HackathonSeatingGridOptimizer` | `classifyRows(int[][], int)` | Reusable row average helper classifying venue rows as `"Quiet Zone"` or `"Buzzing Zone"` across jagged grids. |
| Class | `PlacementDriveEngine` | `shortlistAndRank(Candidate[])` | Overloaded eligibility filters (`isEligible`), composite scoring, and standard `Arrays.sort()` via `Comparable<Candidate>`. |

#### Assignment Problems (`arrays/assigment_problems`)
| Type | Problem | Signature | Approach / Description |
| :--- | :--- | :--- | :--- |
| Assignment | `FantasyTeamScoreMultiplier` | `applyMultipliers(double[], int, int)` | Modifies caller's array directly in place; applies $2\times$ captain and $1.5\times$ vice-captain score multipliers. |
| Assignment | `DuplicatePlayerPickChecker` | `findDuplicatePick(String[])` | Pairwise nested loops scanning player picks for duplicates in draft selection. |
| Assignment | `TopPerformerTracker` | `findMinMaxSpread(int[])` | Single-pass simultaneous min and max tracking to compute score spread ($max - min$) without sorting. |
| Assignment | `MatchDayGridAnalyzer` | `classifyMatches(int[][], int)` | Modular helper `rowAverage(int[])` assessing cricket innings as `"Power Surge"` vs `"Normal"` on jagged 2D grids. |
| Assignment | `FantasyLeagueAutoDraftRankingEngine` | `draftAndRank(Player[])` | Overloaded drafting filters (`isDraftable`), encapsulated `Player` model, and natural order ranking via `Comparable<Player>`. |

**Key Concepts Covered:**
- Arrays passed by reference (in-place mutation of primitive arrays).
- Nested loop pairwise comparison avoiding symmetric/redundant pair checks ($j = i + 1$).
- Single-pass multi-variable state tracking (avoiding unnecessary $O(n \log n)$ sorting).
- 2D jagged arrays and modular sub-routine design (reusable row-level helpers).
- Method overloading (single-parameter vs multi-parameter predicates).
- Object encapsulation and `Comparable<T>` interface integration with `Arrays.sort()`.

---

### Session 6 — Object-Oriented Programming (OOP) (`oop`)

#### Class Problems (`oop/class_problems`)
| Type | Problem | Signature / Construct | Approach / Description |
| :--- | :--- | :--- | :--- |
| Class | `PlacementRecord` | `PlacementRecord(String, String, double)` / `printRecord()` | Models student placement records; instantiates record objects iterated and formatted via array traversal. |
| Class | `MessWallet` | `topUp(double)`, `deduct(double)`, `getBalance()` | Encapsulated hostel mess wallet with private balance, constructor validation, non-positive guards, and negative balance protection. |
| Class | `Course` | `Course(String, String, int, int)`, `Course(String, String, int)` | Constructor overloading utilizing `this(...)` constructor chaining for theory-only courses defaulting lab credits to 0. |
| Class | `IdCard` | `IdCard(String, int)` | Reference aliasing demonstration; proves variable reference sharing (`== true`) vs separate object identity (`== false`). |
| Class | `Student` | `static printCollegeInfo()` | Static members (`collegeName`, `studentCount`) shared across instances; static method accessing only static context. |

#### Assignment Problems (`oop/assigment_problems`)
| Type | Problem | Signature / Construct | Approach / Description |
| :--- | :--- | :--- | :--- |
| Assignment | `BookInventory` | `BookInventory(String, String, int)` / `printEntry()` | OOP library catalog tracking book title, author, and copies available in a formatted loop over object arrays. |
| Assignment | `PayrollAccount` | `creditBonus(double)`, `deductTax(double)`, `getNetSalary()` | Encapsulated payroll model with private fields, bonus credit validation, bounded tax percentage deduction, and read-only net calculation. |
| Assignment | `Employee` | `Employee(String, String, double)`, `Employee(String, String)` | Constructor chaining using `this(...)` to differentiate permanent employees from interns with zero initial salary and intern flag. |
| Assignment | `HallTicket` | `HallTicket(String, int)` | Validates object reference mutation via aliasing and demonstrates equality checks (`==`) comparing memory addresses. |
| Assignment | `CompanyEmployee` | `static printCompanyInfo()` | Class-level static state management tracking shared company name and cumulative employee count via constructor invocation. |

**Key Concepts Covered:**
- OOP data encapsulation and private access specifiers (`private` fields with getter accessors).
- Constructor overloading and explicit constructor invocation (`this(...)` chaining).
- Memory references, object aliasing, and reference identity vs separate instantiation (`==` comparison).
- Class-level state (`static` variables and `static` methods) vs instance-level state.
- Invariant protection and input validation in business models.

---

## Progress Log

### Date: 19-09-2026 (Session 6)
**Today's Work:**
- Created and checked out new branch `feature/session_6` directly from base `develop`.
- Solved all 5 Category C Class Problems under `oop/class_problems` with strictly zero comments:
  - `PlacementRecord`: Student placement record management with array iteration.
  - `MessWallet`: Encapsulated hostel mess wallet with non-negative balance enforcement.
  - `Course`: Theory and lab course credit management utilizing `this(...)` constructor chaining.
  - `IdCard`: Library card reference management proving reference aliasing vs independent objects.
  - `Student`: Student and college information management with static count and static printer.
- Solved all 5 Category C Assignment Problems under `oop/assigment_problems` with strictly zero comments:
  - `BookInventory`: Library inventory management replacing parallel arrays with OOP objects.
  - `PayrollAccount`: Encapsulated payroll salary management with bonus crediting and tax deduction.
  - `Employee`: Employee profile creation supporting permanent and intern profiles via constructor chaining.
  - `HallTicket`: Exam hall ticket reference aliasing and equality verification.
  - `CompanyEmployee`: Company information and auto-incrementing staff counter via static members.
- Verified 100% test pass rate across all 10 problem suites, clean compilation with `javac`, and verified complete absence of comments in all source files.
- Synchronized documentation in `README.md` across both `feature/session_6` and `main` branches.

---

### Date: 19-09-2026
**Today's Work:**
- Pushed pending commits on `feature/session_3` and updated its documentation.
- Renamed branch `feature/session_3` to `feature/session_4` to correctly align with semester session scheduling.
- Cut new branch `feature/session_5` directly from base `develop`.
- Implemented and verified all 5 Category C Class Problems under `arrays/class_problems`:
  - `HackathonScoreCurveBooster`: In-place flat bonus incrementation.
  - `DuplicateTeamNameFinder`: Pairwise nested loop duplicate detection.
  - `Top3PodiumFinder`: Single pass top-3 podium extraction handling ties.
  - `HackathonSeatingGridOptimizer`: Modular jagged 2D grid row analysis and zone classification.
  - `PlacementDriveEngine`: Encapsulated `Candidate` model with overloaded eligibility filters and `Arrays.sort()` ranking.
- Implemented and verified all 5 Category C Assignment Problems under `arrays/assigment_problems`:
  - `FantasyTeamScoreMultiplier`: In-place captain/vice-captain multipliers.
  - `DuplicatePlayerPickChecker`: Lineup duplicate checking via nested loops.
  - `TopPerformerTracker`: Single pass min/max/spread analysis.
  - `MatchDayGridAnalyzer`: Modular match over-average calculation and power surge classification.
  - `FantasyLeagueAutoDraftRankingEngine`: Overloaded draft eligibility filters with `Player` comparable sorting.
- Verified 100% test pass rate across all 10 problem suites and compiled cleanly with `javac`.

**Next Session Plan:**
- Prepare for Session 7 (OOP Inheritance, Polymorphism, and Abstract Classes).

---

### Date: 05-09-2026
**Today's Work:**
- Completed Week 4 (Functions & Arrays) Category C live-session array logic problems in `feature/session_4` under `arrays/class_problems`:
  - `TwoSum`, `ContainsDuplicate`, `MergeSortedArrays`, `RotateArray`, `StockBuySell`.
- Solved all 5 Category C assignment problems on `feature/session_4` under `arrays/assigment_problems`:
  - `ProductExceptSelf`, `MaximumSubarray`, `ThreeSum`, `SubarraySumEqualsK`, `FindMinRotatedSortedArray`.
- Added Week 2 assignment problem solutions on `feature/session_2` under `string/assigment_problems`:
  - `AtmPinValidator`, `IsbnNormalizerValidator`, `InventoryCsvParser`, `WordFrequencyReport`, `WordReversalEncoder`.
- Completed Week 2 live-session string problems on `feature/session_2` under `string/class_problems`:
  - `VowelConsonantCounter`, `StudentRecordParser`, `FileExtensionValidator`, `PhoneNumberFormatter`, `TransactionReferenceValidator`.
- Added Week 1 assignment solutions on `feature/session_1` under `string/assigment_problems`:
  - `SeatDuplicationChecker`, `TypingAccuracyChecker`, `TrafficSignalAnalyzer`, `InventoryBalancer`, `WordLengthProfiler`.
- Completed Week 1 live-coding fundamentals on `feature/session_1` under `string/class_problems`:
  - `RockPaperScissors`, `PalindromeChecker`, `BmiCalculator`, `UniqueLetterHunt`, `CustomerVerification`.

---

### Date: 05-09-2026 (Initial Setup)
**Today's Work:**
- Initialized repository structure following Semester 3 guidelines.
- Established `main` for documentation and progress logging.
- Created `develop` branch with base project skeleton (`src/main/java/.gitkeep`, `.gitignore`).
- Cut independent feature branches (`feature/session_1`, `feature/session_2`, `feature/session_4`, `feature/session_5`) from `develop`.
