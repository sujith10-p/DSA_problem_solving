from typing import List, Optional


def two_sum(nums: List[int], target: int) -> Optional[List[int]]:
    seen = {}
    for i, num in enumerate(nums):
        need = target - num
        if need in seen:
            return [seen[need], i]
        seen[num] = i
    return None


if __name__ == '__main__':
    # quick smoke test
    nums = [2, 7, 11, 15]
    target = 9
    print(two_sum(nums, target))
