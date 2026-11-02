class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        m = [101, 101]
        for x in prices:
            if x <= m[0]:
                m[1] = m[0]
                m[0] = x
                continue

            if x <= m[1]:
                m[1] = x

        if m[0] + m[1] <= money:
            return money - (m[0] + m[1])

        return money
