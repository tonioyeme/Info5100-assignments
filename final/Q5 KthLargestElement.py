class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        def partition(left, right, pivot_index):
            pivot = nums[pivot_index]

            nums[pivot_index], nums[right] = nums[right], nums[pivot_index]

            store_index = left
            for i in range(left, right):
                if nums[i] < pivot:
                    nums[i], nums[store_index] = nums[store_index], nums[i]
                    store_index += 1

            nums[right], nums[store_index] = nums[store_index], nums[right]

            return store_index

        def selection(left, right, k_smallest):
            pivot_index = random.randint(left, right)
            pivot_index = partition(left, right, pivot_index)

            if left == right:
                return nums[left]

            if k_smallest == pivot_index:
                return nums[k_smallest]
            elif k_smallest < pivot_index:
                return selection(left, pivot_index - 1, k_smallest)
            elif k_smallest > pivot_index:
                return selection(pivot_index + 1, right, k_smallest)

        return selection(0, len(nums) - 1, len(nums) - k)

