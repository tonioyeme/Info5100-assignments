class Solution:
    def sumZero(self, n: int) -> List[int]:
        summ = 0
        res = []

        if n == 2:
            return [-1, 1]

        for i in range(n - 1):
            res.append(i)
            summ += i
        res.append(-summ)

        return res