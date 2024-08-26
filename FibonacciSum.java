import unittest

class FibonacciSum:
    @staticmethod
    def fibonacci_sum(n):
        if n <= 0:
            return 0
        elif n == 1:
            return 0
        elif n == 2:
            return 1

        a, b = 0, 1
        sum_fib = a + b
        
        for _ in range(2, n):
            a, b = b, a + b
            sum_fib += b
        
        return sum_fib

    @staticmethod
    def run_tests():
        class TestFibonacciSum(unittest.TestCase):
            def test_sum_zero_elements(self):
                self.assertEqual(FibonacciSum.fibonacci_sum(0), 0)

            def test_sum_one_element(self):
                self.assertEqual(FibonacciSum.fibonacci_sum(1), 0)  # Apenas o primeiro elemento é 0

            def test_sum_two_elements(self):
                self.assertEqual(FibonacciSum.fibonacci_sum(2), 1)  # 0 + 1

            def test_sum_five_elements(self):
                self.assertEqual(FibonacciSum.fibonacci_sum(5), 7)  # 0 + 1 + 1 + 2 + 3

            def test_sum_ten_elements(self):
                self.assertEqual(FibonacciSum.fibonacci_sum(10), 88)  # Soma dos primeiros 10 elementos

        unittest.TextTestRunner().run(unittest.TestLoader().loadTestsFromTestCase(TestFibonacciSum))

# Exemplo de uso e execução dos testes:
if __name__ == "__main__":
    n = 10  # Defina o valor de n conforme necessário
    print(f"A soma dos {n} primeiros elementos da Série de Fibonacci é: {FibonacciSum.fibonacci_sum(n)}")
    
    # Executa os testes
    FibonacciSum.run_tests()
