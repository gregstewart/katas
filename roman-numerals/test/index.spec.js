import { expect } from 'chai';
import { convert } from '../index';

describe('Roman Numerals converter', () => {
  it('takes 1 and returns I', () => {
    expect(convert(1)).to.equal('I');
  });
  it('takes 2 and returns II', () => {
    expect(convert(2)).to.equal('II');
  });
  it('takes 4 and returns IV', () => {
    expect(convert(4)).to.equal('IV');
  });
  it('takes 5 and returns V', () => {
    expect(convert(5)).to.equal('V');
  });
  it('takes 6 and returns VI', () => {
    expect(convert(6)).to.equal('VI');
  });
  it('takes 9 and returns IX', () => {
    expect(convert(9)).to.equal('IX');
  });
  it('takes 10 and returns X', () => {
    expect(convert(10)).to.equal('X');
  });
  it('takes 15 and returns XV', () => {
    expect(convert(15)).to.equal('XV');
  });
  it('takes 16 and returns XVI', () => {
    expect(convert(16)).to.equal('XVI');
  });
  it('takes 20 and returns XX', () => {
    expect(convert(20)).to.equal('XX');
  });
  it('takes 40 and returns XL', () => {
    expect(convert(40)).to.equal('XL');
  });
  it('takes 49 and returns XLIX', () => {
    expect(convert(49)).to.equal('XLIX');
  });
  it('takes 50 and returns L', () => {
    expect(convert(50)).to.equal('L');
  });
  it('takes 90 and returns XC', () => {
    expect(convert(90)).to.equal('XC');
  });
  it('takes 100 and returns C', () => {
    expect(convert(100)).to.equal('C');
  });
  it('takes 500 and returns D', () => {
    expect(convert(500)).to.equal('D');
  });
  it('takes 490 and returns CDXC', () => {
    expect(convert(490)).to.equal('CDXC');
  });
  it('takes 900 and returns CM', () => {
    expect(convert(900)).to.equal('CM');
  });
  it('takes 1000 and returns M', () => {
    expect(convert(1000)).to.equal('M');
  });
});
