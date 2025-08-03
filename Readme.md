# 🔄 Sorting Algorithms - Complete Guide

Welcome to the world of sorting algorithms! This repository contains implementations of 5 fundamental sorting algorithms. Let's understand each one step by step.

## 📚 What is Sorting?

Sorting means arranging elements in a specific order (usually ascending - smallest to largest). Think of it like arranging your books by height or organizing your music playlist alphabetically.

---

## 1. 🫧 Bubble Sort

### How it Works:
Bubble Sort is like bubbles rising to the surface! It compares adjacent elements and swaps them if they're in the wrong order.

### Step-by-Step Example:
**Array: [5, 2, 6, 4, 1, 3]**

**Pass 1:**
- Compare 5 & 2 → Swap → [2, 5, 6, 4, 1, 3]
- Compare 5 & 6 → No swap → [2, 5, 6, 4, 1, 3]
- Compare 6 & 4 → Swap → [2, 5, 4, 6, 1, 3]
- Compare 6 & 1 → Swap → [2, 5, 4, 1, 6, 3]
- Compare 6 & 3 → Swap → [2, 5, 4, 1, 3, 6]

*Largest element (6) "bubbled" to the end!*

**Continue this process until array is sorted...**

### Time Complexity:
- **Best Case:** O(n) - Array already sorted
- **Average Case:** O(n²) - Random arrangement
- **Worst Case:** O(n²) - Array sorted in reverse

### Space Complexity: O(1) - Only uses a few extra variables

### When to Use:
- Small datasets
- Educational purposes
- When simplicity is more important than efficiency

---

## 2. 🎯 Selection Sort

### How it Works:
Selection Sort finds the smallest element and puts it at the beginning, then finds the second smallest, and so on.

### Step-by-Step Example:
**Array: [5, 2, 6, 4, 1, 3]**

**Step 1:** Find minimum (1) → Swap with first position → [1, 2, 6, 4, 5, 3]
**Step 2:** Find minimum in remaining (2) → Already in position → [1, 2, 6, 4, 5, 3]
**Step 3:** Find minimum in remaining (3) → Swap → [1, 2, 3, 4, 5, 6]
**Continue...**

### Time Complexity:
- **Best Case:** O(n²) - Always scans entire array
- **Average Case:** O(n²)
- **Worst Case:** O(n²)

### Space Complexity: O(1)

### When to Use:
- Small datasets
- When memory is limited
- When you want to minimize swaps

---

## 3. 📝 Insertion Sort

### How it Works:
Like sorting playing cards in your hand! Take one element and insert it in the correct position among the already sorted elements.

### Step-by-Step Example:
**Array: [5, 2, 6, 4, 1, 3]**

**Step 1:** [5] (first element considered sorted)
**Step 2:** Insert 2 → [2, 5]
**Step 3:** Insert 6 → [2, 5, 6]
**Step 4:** Insert 4 → [2, 4, 5, 6]
**Step 5:** Insert 1 → [1, 2, 4, 5, 6]
**Step 6:** Insert 3 → [1, 2, 3, 4, 5, 6]

### Time Complexity:
- **Best Case:** O(n) - Array already sorted
- **Average Case:** O(n²)
- **Worst Case:** O(n²) - Array sorted in reverse

### Space Complexity: O(1)

### When to Use:
- Small datasets
- Nearly sorted arrays
- Online algorithms (sorting as data arrives)

---

## 4. 🔄 Merge Sort

### How it Works:
**Divide and Conquer!** Split the array into halves until you have single elements, then merge them back in sorted order.

### Step-by-Step Example:
**Array: [5, 2, 6, 4, 1, 3]**

**Divide Phase:**
```
[5, 2, 6, 4, 1, 3]
    /           \
[5, 2, 6]    [4, 1, 3]
  /    \        /    \
[5]  [2, 6]  [4]  [1, 3]
      /  \        /   \
    [2] [6]     [1]  [3]
```

**Merge Phase:**
```
[2] [6] → [2, 6]
[1] [3] → [1, 3]
[5] [2, 6] → [2, 5, 6]
[4] [1, 3] → [1, 3, 4]
[2, 5, 6] [1, 3, 4] → [1, 2, 3, 4, 5, 6]
```

### Time Complexity:
- **Best Case:** O(n log n)
- **Average Case:** O(n log n)
- **Worst Case:** O(n log n)

### Space Complexity: O(n) - Needs extra space for temporary arrays

### When to Use:
- Large datasets
- When stable sorting is needed
- When consistent performance is required

---

## 5. ⚡ Quick Sort

### How it Works:
Choose a "pivot" element, partition the array so smaller elements go left and larger go right, then recursively sort both sides.

### Step-by-Step Example:
**Array: [5, 2, 6, 4, 1, 3]** (Pivot = 3)

**Partition:** Elements < 3 go left, elements > 3 go right
→ [2, 1] **3** [5, 6, 4]

**Recursively sort left side:** [2, 1] → [1, 2]
**Recursively sort right side:** [5, 6, 4] → [4, 5, 6]

**Result:** [1, 2, 3, 4, 5, 6]

### Time Complexity:
- **Best Case:** O(n log n) - Good pivot selection
- **Average Case:** O(n log n)
- **Worst Case:** O(n²) - Poor pivot selection (already sorted array)

### Space Complexity: O(log n) - Recursive call stack

### When to Use:
- Large datasets
- When average case performance matters most
- In-place sorting preferred

---

## 📊 Comparison Table

| Algorithm | Best Time | Average Time | Worst Time | Space | Stable | In-Place |
|-----------|-----------|--------------|------------|-------|--------|----------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ | ✅ |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | ❌ | ✅ |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | ✅ | ✅ |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ | ❌ |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ | ✅ |

## 🎯 Quick Decision Guide

**Choose Bubble Sort:** Only for learning or very small arrays
**Choose Selection Sort:** When memory is extremely limited
**Choose Insertion Sort:** For small or nearly sorted arrays
**Choose Merge Sort:** When you need guaranteed O(n log n) performance
**Choose Quick Sort:** For general purpose sorting of large arrays

## 🚀 How to Run

1. Open terminal in the sorting folder
2. Compile: `javac FileName.java`
3. Run: `java FileName`

Example:
```bash
javac BubbleSort.java
java BubbleSort
```

## 🧠 Key Terms

- **Stable:** Equal elements maintain their relative order
- **In-Place:** Sorts without using extra space
- **Time Complexity:** How runtime grows with input size
- **Space Complexity:** How memory usage grows with input size

Happy Learning! 🎉