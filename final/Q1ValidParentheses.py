class Solution:
    def isValid(self, s: str) -> bool:
        # iterate the string
        # use stack to store
        tmp = []
        for char in s:
            if char == "(" or char == "[" or char == "{":
                tmp.append(char)
            else:
                if not tmp:
                    return False
                if (char == ")" and tmp[-1] == "(") or (char == "]" and tmp[-1] == "[") or (
                        char == "}" and tmp[-1] == "{"):
                    tmp.pop()
                else:
                    return False

        return len(tmp) == 0