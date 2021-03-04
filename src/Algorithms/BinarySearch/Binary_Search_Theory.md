BINARY SEARCH ALGORITHM
************************************************************************************************************************
Binary search is the search technique which works efficiently on the sorted lists.
Hence, in order to search an element into some list by using binary search technique,
we must ensure that the list is sorted.

Binary search follows divide and conquer approach in which, the list is divided into two halves and the item is compared with the middle element of the list.
If the match is found then, the location of middle element is returned otherwise,
we search into either of the halves depending upon the result produced through the match.

************************************************************************************************************************
ALGORITHM:

BINARY_SEARCH(A, lower_bound, upper_bound, VAL)

Step 1: [INITIALIZE] SET BEG = lower_bound
END = upper_bound, POS = - 1
Step 2: Repeat Steps 3 and 4 while BEG <=END
Step 3: SET MID = (BEG + END)/2
Step 4: IF A[MID] = VAL
SET POS = MID
PRINT POS
Go to Step 6
ELSE IF A[MID] > VAL
SET END = MID - 1
ELSE
SET BEG = MID + 1
[END OF IF]
[END OF LOOP]
Step 5: IF POS = -1
PRINT "VALUE IS NOT PRESENT IN THE ARRAY"
[END OF IF]
Step 6: EXIT

************************************************************************************************************************
Complexity
SN	        Performance	                        Complexity

1	        Worst case	                        O(log n)
2	        Best case	                        O(1)
3	        Average Case	                    O(log n)
4	        Worst case space complexity	        O(1)

************************************************************************************************************************


************************************************************************************************************************


************************************************************************************************************************
