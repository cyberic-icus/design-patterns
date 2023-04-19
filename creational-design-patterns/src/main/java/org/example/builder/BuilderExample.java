package org.example.builder;

public class BuilderExample {
    private final String field1;
    private final String field2;
    private final String field3;
    private final String field4;
    private final String field5;
    private final String field6;
    private final String field7;

    public BuilderExample(BuilderExample.Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
        this.field5 = builder.field5;
        this.field6 = builder.field6;
        this.field7 = builder.field7;
    }

    public static class Builder {
        private String field1;
        private String field2;
        private String field3;
        private String field4;
        private String field5;
        private String field6;
        private String field7;

        public Builder() {
            this.field1 = "field1";
            this.field2 = "field2";
            this.field3 = "field3";
            this.field4 = "field4";
            this.field5 = "field5";
            this.field6 = "field6";
            this.field7 = "field7";
        }

        public Builder setField1(String field) {
            this.field1 = field1;
            return this;
        }

        public Builder setField2(String field) {
            this.field2 = field2;
            return this;
        }

        public Builder setField3(String field) {
            this.field3 = field3;
            return this;
        }

        public Builder setField4(String field) {
            this.field4 = field4;
            return this;
        }

        public Builder setField5(String field) {
            this.field5 = field5;
            return this;
        }

        public Builder setField6(String field) {
            this.field6 = field6;
            return this;
        }

        public Builder setField7(String field) {
            this.field7 = field7;
            return this;
        }

        public BuilderExample build() {
            return new BuilderExample(this);
        }
    }


}
