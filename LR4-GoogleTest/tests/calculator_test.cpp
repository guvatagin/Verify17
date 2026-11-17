#include "calculator.h"
#include <gtest/gtest.h>
#include <stdexcept>
TEST(CalculatorTest, AddsNumbers) { Calculator c; EXPECT_DOUBLE_EQ(4, c.add(2, 2)); }
TEST(CalculatorTest, BoundaryValues) { Calculator c; EXPECT_DOUBLE_EQ(0, c.add(-5, 5)); }
TEST(CalculatorTest, DivideTolerance) { Calculator c; EXPECT_NEAR(3.333333, c.divide(10, 3), 1e-6); }
TEST(CalculatorTest, DivideByZeroThrows) { Calculator c; EXPECT_THROW(c.divide(10, 0), std::invalid_argument); }
