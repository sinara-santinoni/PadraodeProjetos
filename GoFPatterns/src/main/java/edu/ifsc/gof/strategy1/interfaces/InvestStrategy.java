package edu.ifsc.gof.strategy1.interfaces;

/**
 * Interface comum para todas as estratégias.
 */
public interface InvestStrategy {
    double execute(double quantia);
}