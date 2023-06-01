Calculating Pi upto 5000 digits using different methods:
1. Machin-like formula
2. Vieta and Accelerated Vieta
3. Wallis Product
4. Monte Carlo Approximation Method

---
# Calculating $\pi$ upto 5000 digits using Machin-like formula
This equation was discovered in 1706 by John Machin, and has been in use for around 300 years. It is suitable for the calculation of Pi because it converges quickly.

${\displaystyle {\frac  {\pi }{4}}=4\arctan {\frac  {1}{5}}-\arctan {\frac  {1}{239}} }$

Sources:
https://en.wikipedia.org/wiki/Machin-like_formula
https://www.youtube.com/watch?v=enQdwZwoyyo

---
# Calculating $\pi$ using Viète's formula

In mathematics, Viète's formula is the following infinite product of nested radicals representing twice the reciprocal of the mathematical constant $\pi$:

${\displaystyle {\frac {2}{\pi }}={\frac {\sqrt {2}}{2}}\cdot {\frac {\sqrt {2+{\sqrt {2}}}}{2}}\cdot {\frac {\sqrt {2+{\sqrt {2+{\sqrt {2}}}}}}{2}}\cdots }$

It can also be represented as:

${\displaystyle {\frac {2}{\pi }}=\prod _{n=1}^{\infty }\cos {\frac {\pi }{2^{n+1}}}}$

The formula is named after François Viète, who published it in 1593.

References: https://en.wikipedia.org/wiki/Vi%C3%A8te%27s_formula

---
## Kreminski's Accelerated Convergence of Viète's Formula

This infinite product formula, while elegant, is a poor choice for computing the decimal digits of π because it converges so slowly.  
You may have observed that each Viète iteration requires a square root operation.  Square root operations are computationally very expensive making Viète's Formula computationally uninteresting.

An article by Rick Kreminski, offers a recursion that accelerates the convergence of Viète's Formula. Viète became computationally interesting.

${\displaystyle {\begin{aligned}V_{(k,n)}&=\frac{4^{k}V_{(k-1, n+1)} - V_{(k-1, n)}}{4^k-1} \\V_{(0,n)}&=p_n \end{aligned}}}$

Let $p_n$ denote the partial product of the first n terms in (Vieta), and let $V_{(k,n)} $ be the accelerations.

Reference: R. Kreminski, Pi to Thousands of Digits from Vieta's Formula, Mathematics Magazine, Vol. 81, No. 3, June 2008, 201-207 - https://www.jstor.org/stable/27643107

---
# Calculating $\pi$ using Wallis product

In mathematics, the Wallis product for π, published in 1656 by John Wallis,[1] states that

${\displaystyle {\begin{aligned}{\frac {\pi }{2}}&=\prod _{n=1}^{\infty }{\frac {4n^{2}}{4n^{2}-1}}=\prod _{n=1}^{\infty }\left({\frac {2n}{2n-1}}\cdot {\frac {2n}{2n+1}}\right)\\[6pt]&={\Big (}{\frac {2}{1}}\cdot {\frac {2}{3}}{\Big )}\cdot {\Big (}{\frac {4}{3}}\cdot {\frac {4}{5}}{\Big )}\cdot {\Big (}{\frac {6}{5}}\cdot {\frac {6}{7}}{\Big )}\cdot {\Big (}{\frac {8}{7}}\cdot {\frac {8}{9}}{\Big )}\cdot \;\cdots \\\end{aligned}}}$

---
# Calculating $\pi$ using Monte Carlo Method

Monte Carlo methods, or Monte Carlo experiments, are a broad class of computational algorithms that rely on repeated random sampling to obtain numerical results.

Given that the ratio of their areas is $\pi/4$, the value of $\pi$ can be approximated using a Monte Carlo method:

1. Draw a square, then inscribe a quadrant within it
2. Uniformly scatter a given number of points over the square
3. Count the number of points inside the quadrant, i.e. having a distance from the origin of less than 1
4. The ratio of the inside-count and the total-sample-count is an estimate of the ratio of the two areas, $\pi/4$. Multiply the result by 4 to estimate π.

Ref: https://en.wikipedia.org/wiki/Monte_Carlo_method
