import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CallCardsComponent } from './call-cards.component';

describe('CallCardsComponent', () => {
  let component: CallCardsComponent;
  let fixture: ComponentFixture<CallCardsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CallCardsComponent]
    });
    fixture = TestBed.createComponent(CallCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
