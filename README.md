# Step_semester_3

```text
main documentation only (this README)
└── develop empty Java project skeleton — never receives merges
    ├── feature/session_1
    ├── feature/session_2
    └── feature/session_3
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
| [`feature/session_3`](https://github.com/rajdeep-pixel/step-classes-03/tree/feature/session_3) | Week 3 — Functions & arrays | `arrays` | 5 | 5 |

**30 Java files solved to date.** Each session branch carries its own focused codebase with class exercises and homework assignments.

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

### Compile and run Session 3 (Functions & Arrays):
```bash
git checkout feature/session_3
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
| Class | `RockPaperScissors` | 5-round game simulation against computer random choice; round outcome evaluator, scorekeeper, and win-rate calculation. |
| Class | `PalindromeChecker` | Multi-approach palindrome detector: 2-pointer iterative scan, recursive substring reduction, and char-array reversal reconstruction. |
| Class | `BmiCalculator` | Team BMI processor; computes BMI across height/weight arrays, categorizes status (Underweight, Normal, Overweight, Obese), and prints a formatted wellness table. |
| Class | `UniqueLetterHunt` | First non-repeating character hunt; two-pass scan using a 256-element ASCII frequency bucket array with an early return on frequency == 1. |
| Class | `CustomerVerification` | Customer name reversal; converts string to character array and traverses backward to rebuild reversed text. |
| Assignment | `SeatDuplicationChecker` | Exam hall duplicate seat detector; pairwise nested loop scan identifying duplicate seat allocations without external collections. |
| Assignment | `TypingAccuracyChecker` | Typing speed accuracy profiler; compares characters between original prompt and typed text, computes accuracy percentage, and flags the first mismatch index. |
| Assignment | `TrafficSignalAnalyzer` | Traffic signal streak analyzer; iterates consecutive signal states, tracking maximum identical color streak length and state. |
| Assignment | `InventoryBalancer` | Warehouse inventory balancer; evaluates bin quantities against target stock threshold to calculate redistribution delta. |
| Assignment | `WordLengthProfiler` | Movie review word length profiler; splits text into words, computes word lengths, and categorizes into length brackets. |

**Key Concepts Covered:**
Variables and primitive types, arithmetic and relational operators, `Math.random()` / `Random`, `Scanner` console input, 1D arrays, nested loops, recursion vs iteration, ASCII frequency buckets, and array reversals.

---

### Session 2 — Strings (`string`)

| Type | Problem | Approach / Description |
| :--- | :--- | :--- |
| Class | `VowelConsonantCounter` | Text analyzer counting vowels and consonants using case normalization, `Character.isLetter()`, and character classification. |
| Class | `StudentRecordParser` | CSV parser tokenizing comma-delimited student records (ID, name, department, marks) into structured output. |
| Class | `FileExtensionValidator` | Extension validator using `lastIndexOf(".")` and `substring()`; handles hidden files, missing dots, and whitelist checking. |
| Class | `PhoneNumberFormatter` | Phone number formatter masking 10-digit raw inputs into standardized display with asterisks shielding sensitive digits. |
| Class | `TransactionReferenceValidator` | Multi-stage bank reference validator with ordered failure reasons (total length, bank code prefix, timestamp payload). |
| Assignment | `AtmPinValidator` | Numeric ATM PIN validator verifying strict 4-digit or 6-digit length and `Character.isDigit()` checks across all characters. |
| Assignment | `IsbnNormalizerValidator` | Cleans ISBN input by stripping hyphens/spaces, verifying length criteria (10 or 13 digits) and check validity. |
| Assignment | `InventoryCsvParser` | Tokenizes multi-field inventory CSV rows, extracting SKU, product name, quantity, and unit price with validation. |
| Assignment | `WordFrequencyReport` | Tokenizes text, filters out common English stop words (e.g., "the", "is", "and"), and builds word frequency counts. |
| Assignment | `WordReversalEncoder` | Sentence encoder splitting text into words, reversing each word individually, and reconstructing the sentence maintaining original word order. |

**Key Concepts Covered:**
`charAt()`, `split()`, `substring()`, `lastIndexOf()`, `trim()`, `toLowerCase()` / `toUpperCase()`, `equalsIgnoreCase()`, `StringBuilder`, `Character.isLetter()` / `isDigit()`, and staged validation that returns descriptive diagnostic failure reasons rather than a bare boolean.

---

### Session 3 — Functions & Arrays (`arrays`)

| Type | Problem | Approach |
| :--- | :--- | :--- |
| Class | Two Sum (`TwoSum`) | Brute-force nested loop scan checking every pair `nums[i] + nums[j] == target` |
| Class | Contains Duplicate (`ContainsDuplicate`) | Brute-force pairwise nested comparison checking if `nums[i] == nums[j]` |
| Class | Merge Sorted Arrays (`MergeSortedArrays`) | Two-pointer merge comparing current elements of both sorted arrays with tail drain into a new array |
| Class | Rotate Array (`RotateArray`) | Index remap into a fresh array using `(i + k) % n`, normalizing `k % n` and negative shifts |
| Class | Best Time to Buy and Sell Stock (`StockBuySell`) | Single pass greedy tracking minimum buy price so far and maximum potential profit |
| Assignment | Product of Array Except Self (`ProductExceptSelf`) | Two-pass prefix products and suffix running multiplier; $O(1)$ extra space, no division |
| Assignment | Maximum Subarray (`MaximumSubarray`) | Kadane's algorithm tracking running sum seeded with `nums[0]` so all-negative arrays return their largest element |
| Assignment | 3Sum (`ThreeSum`) | Array sort + anchor iteration with two-pointer inward squeeze; duplicate skipping at anchor and both pointers |
| Assignment | Subarray Sum Equals K (`SubarraySumEqualsK`) | Prefix sums frequency tracking with `HashMap<Integer, Integer>`, seeded with `(0, 1)` |
| Assignment | Find Minimum in Rotated Sorted Array (`FindMinRotatedSortedArray`) | Modified binary search comparing `nums[mid]` against `nums[right]` boundary |

**Key Concepts Covered:**
Two-pointer inward traversal, prefix & suffix accumulation passes, greedy single-pass extrema tracking, Kadane's dynamic programming, binary search boundary invariants on rotated spaces, prefix sum frequency hashing, and handling edge cases (all-negative inputs, non-monotonic subarrays, negative rotation shifts).

---

## Known Gaps & Future Enhancements

- **Package Naming:** `feature/session_1` and `feature/session_2` use `string` as their top-level package, while `feature/session_3` uses `arrays`.
- **Directory Spelling:** The folder name `assigment_problems` is consistently spelled without the second 'n' across all branches; kept uniform across the project.
- **Optimization Opportunities:**
  - `TwoSum` and `ContainsDuplicate` in Session 3 use $O(n^2)$ brute-force implementations as required by the initial live session; refactoring to $O(n)$ using `HashMap` and `HashSet` is scheduled for interview prep.
  - Session 3 `MaximumSubarray` currently implements Kadane's $O(n)$ algorithm; implementing the Divide-and-Conquer $O(n \log n)$ alternative is planned as an interview follow-up.

---

## Progress Log

### Date: 05-09-2026
**Today's Work:**
- Completed Week 3 (Functions & Arrays) Category C live-session array logic problems in `feature/session_3` under `arrays/class_problems`:
  - `TwoSum`: Brute-force nested loop search for target pair.
  - `ContainsDuplicate`: Pairwise scan detecting duplicates.
  - `MergeSortedArrays`: Two-pointer merge with tail drain into a clean result array.
  - `RotateArray`: Direct index remapping `(i + k) % n` into a fresh array; handled `k > n` with `k % n` and negative shifts.
  - `StockBuySell`: One-pass minimum tracking ensuring buy occurs before sell.
- Solved all 5 Category C assignment problems on `feature/session_3` under `arrays/assigment_problems`:
  - `ProductExceptSelf`: Prefix and suffix multiplication passes with zero division.
  - `MaximumSubarray`: Kadane's algorithm seeded with `nums[0]` to correctly handle all-negative inputs.
  - `ThreeSum`: Sort + two-pointer scan with duplicate pruning at anchor and both pointers.
  - `SubarraySumEqualsK`: Hash map prefix sum tracking seeded with `(0, 1)`.
  - `FindMinRotatedSortedArray`: Modified binary search comparing `mid` against `right`.
- Added Week 2 assignment problem solutions on `feature/session_2` under `string/assigment_problems`:
  - `AtmPinValidator`, `IsbnNormalizerValidator`, `InventoryCsvParser`, `WordFrequencyReport`, `WordReversalEncoder`.
- Completed Week 2 live-session string problems on `feature/session_2` under `string/class_problems`:
  - `VowelConsonantCounter`, `StudentRecordParser`, `FileExtensionValidator`, `PhoneNumberFormatter`, `TransactionReferenceValidator`.
- Added Week 1 assignment solutions on `feature/session_1` under `string/assigment_problems`:
  - `SeatDuplicationChecker`, `TypingAccuracyChecker`, `TrafficSignalAnalyzer`, `InventoryBalancer`, `WordLengthProfiler`.
- Completed Week 1 live-coding fundamentals on `feature/session_1` under `string/class_problems`:
  - `RockPaperScissors`, `PalindromeChecker`, `BmiCalculator`, `UniqueLetterHunt`, `CustomerVerification`.

**Next Session Plan:**
- Prepare for Session 4 (OOP / Classes & Objects).
- Implement $O(n)$ `HashMap` versions of `TwoSum` and `ContainsDuplicate`.
- Implement Divide-and-Conquer $O(n \log n)$ variant for `MaximumSubarray`.

**Issues Faced:**
- `RotateArray` threw `ArrayIndexOutOfBoundsException` when $k > n$ until `k = k % n` normalization and negative offset handling (`k += n`) were introduced.
- `ThreeSum` produced duplicate triplets on arrays with multiple identical values; resolved by adding duplicate skip loops for the anchor $i$, left pointer, and right pointer.
- Subarray Sum Equals K cannot be solved using a standard two-pointer sliding window because negative values make the cumulative sum non-monotonic; resolved using `HashMap` prefix sum frequency counting.
- Staged validation in `TransactionReferenceValidator` and `IsbnNormalizerValidator` required ordered error precedence (length check first, then prefix/code, then payload) to prevent misleading diagnostic messages.

---

### Date: 05-09-2026 (Initial Setup)
**Today's Work:**
- Initialized repository structure following Semester 3 guidelines.
- Established `main` for documentation and progress logging.
- Created `develop` branch with base project skeleton (`src/main/java/.gitkeep`, `.gitignore`).
- Cut independent feature branches (`feature/session_1`, `feature/session_2`, `feature/session_3`) from `develop`.
