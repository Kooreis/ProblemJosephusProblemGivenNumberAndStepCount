Here is a Python console application that solves the Josephus problem:

```python
def josephus(n, k):
    if n == 1:
        return 0
    else:
        return (josephus(n - 1, k) + k) % n

def main():
    n = int(input("Enter the number of people: "))
    k = int(input("Enter the step count: "))
    print("The person who survives is: " + str(josephus(n, k) + 1))

if __name__ == "__main__":
    main()
```

To use this application, run it in a Python environment. It will prompt you to enter the number of people and the step count. After you enter these values, it will print the position of the person who survives.