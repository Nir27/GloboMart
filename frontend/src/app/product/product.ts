import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product.model';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {
  // Define the newProduct object with initial values
  newProduct: Product = { id: 0, name: '', price: 0, category: '' };

  // Constructor for the component
  constructor(private productService: ProductService) { }

  // Initialization lifecycle hook
  ngOnInit(): void {
    // Empty for now
  }

  // Method to add a product
  addProduct(): void {
    // Call the addProduct method of ProductService and subscribe to the Observable
    this.productService.addProduct(this.newProduct)
      .subscribe(() => {
        // Placeholder comment for future logic
      });
  }
}
