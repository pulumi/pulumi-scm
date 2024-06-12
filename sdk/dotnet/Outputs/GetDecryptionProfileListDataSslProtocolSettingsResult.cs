// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetDecryptionProfileListDataSslProtocolSettingsResult
    {
        /// <summary>
        /// The AuthAlgoMd5 param. Default: `true`.
        /// </summary>
        public readonly bool AuthAlgoMd5;
        /// <summary>
        /// The AuthAlgoSha1 param. Default: `true`.
        /// </summary>
        public readonly bool AuthAlgoSha1;
        /// <summary>
        /// The AuthAlgoSha256 param. Default: `true`.
        /// </summary>
        public readonly bool AuthAlgoSha256;
        /// <summary>
        /// The AuthAlgoSha384 param. Default: `true`.
        /// </summary>
        public readonly bool AuthAlgoSha384;
        /// <summary>
        /// The EncAlgo3des param. Default: `true`.
        /// </summary>
        public readonly bool EncAlgo3des;
        /// <summary>
        /// The EncAlgoAes128Cbc param. Default: `true`.
        /// </summary>
        public readonly bool EncAlgoAes128Cbc;
        /// <summary>
        /// The EncAlgoAes128Gcm param. Default: `true`.
        /// </summary>
        public readonly bool EncAlgoAes128Gcm;
        /// <summary>
        /// The EncAlgoAes256Cbc param. Default: `true`.
        /// </summary>
        public readonly bool EncAlgoAes256Cbc;
        /// <summary>
        /// The EncAlgoAes256Gcm param. Default: `true`.
        /// </summary>
        public readonly bool EncAlgoAes256Gcm;
        /// <summary>
        /// The EncAlgoChacha20Poly1305 param. Default: `true`.
        /// </summary>
        public readonly bool EncAlgoChacha20Poly1305;
        /// <summary>
        /// The EncAlgoRc4 param. Default: `true`.
        /// </summary>
        public readonly bool EncAlgoRc4;
        /// <summary>
        /// The KeyxchgAlgoDhe param. Default: `true`.
        /// </summary>
        public readonly bool KeyxchgAlgoDhe;
        /// <summary>
        /// The KeyxchgAlgoEcdhe param. Default: `true`.
        /// </summary>
        public readonly bool KeyxchgAlgoEcdhe;
        /// <summary>
        /// The KeyxchgAlgoRsa param. Default: `true`.
        /// </summary>
        public readonly bool KeyxchgAlgoRsa;
        /// <summary>
        /// The MaxVersion param. String must be one of these: `"sslv3"`, `"tls1-0"`, `"tls1-1"`, `"tls1-2"`, `"tls1-3"`, `"max"`. Default: `"tls1-2"`.
        /// </summary>
        public readonly string MaxVersion;
        /// <summary>
        /// The MinVersion param. String must be one of these: `"sslv3"`, `"tls1-0"`, `"tls1-1"`, `"tls1-2"`, `"tls1-3"`. Default: `"tls1-0"`.
        /// </summary>
        public readonly string MinVersion;

        [OutputConstructor]
        private GetDecryptionProfileListDataSslProtocolSettingsResult(
            bool authAlgoMd5,

            bool authAlgoSha1,

            bool authAlgoSha256,

            bool authAlgoSha384,

            bool encAlgo3des,

            bool encAlgoAes128Cbc,

            bool encAlgoAes128Gcm,

            bool encAlgoAes256Cbc,

            bool encAlgoAes256Gcm,

            bool encAlgoChacha20Poly1305,

            bool encAlgoRc4,

            bool keyxchgAlgoDhe,

            bool keyxchgAlgoEcdhe,

            bool keyxchgAlgoRsa,

            string maxVersion,

            string minVersion)
        {
            AuthAlgoMd5 = authAlgoMd5;
            AuthAlgoSha1 = authAlgoSha1;
            AuthAlgoSha256 = authAlgoSha256;
            AuthAlgoSha384 = authAlgoSha384;
            EncAlgo3des = encAlgo3des;
            EncAlgoAes128Cbc = encAlgoAes128Cbc;
            EncAlgoAes128Gcm = encAlgoAes128Gcm;
            EncAlgoAes256Cbc = encAlgoAes256Cbc;
            EncAlgoAes256Gcm = encAlgoAes256Gcm;
            EncAlgoChacha20Poly1305 = encAlgoChacha20Poly1305;
            EncAlgoRc4 = encAlgoRc4;
            KeyxchgAlgoDhe = keyxchgAlgoDhe;
            KeyxchgAlgoEcdhe = keyxchgAlgoEcdhe;
            KeyxchgAlgoRsa = keyxchgAlgoRsa;
            MaxVersion = maxVersion;
            MinVersion = minVersion;
        }
    }
}