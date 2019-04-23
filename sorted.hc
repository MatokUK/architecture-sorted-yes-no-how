module Sorted where

isSortedAndHow :: [Int] -> String
isSortedAndHow lst
  | isSortedAscending lst = "yes, ascending"
  | isSortedDescending lst = "yes, descending"
  | otherwise = "no"


isSortedAscending :: [Int] -> Bool
isSortedAscending lst = isNotSortedBy lst (\(a,b) -> a > b)

isSortedDescending :: [Int] -> Bool
isSortedDescending lst = isNotSortedBy lst (\(a,b) -> a < b)

isNotSortedBy :: [Int] -> ((Int, Int) -> Bool) -> Bool
isNotSortedBy lst cmp = (length $ filter cmp $ zip lst (drop 1 lst)) == 0