// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scm.Outputs
{

    [OutputType]
    public sealed class GetTlsServiceProfileProtocolSettingsResult
    {
        /// <summary>
        /// Allow authentication SHA1.
        /// </summary>
        public readonly bool AuthAlgoSha1;
        /// <summary>
        /// Allow authentication SHA256.
        /// </summary>
        public readonly bool AuthAlgoSha256;
        /// <summary>
        /// Allow authentication SHA384.
        /// </summary>
        public readonly bool AuthAlgoSha384;
        /// <summary>
        /// Allow algorithm 3DES.
        /// </summary>
        public readonly bool EncAlgo3des;
        /// <summary>
        /// Allow algorithm AES-128-CBC.
        /// </summary>
        public readonly bool EncAlgoAes128Cbc;
        /// <summary>
        /// Allow algorithm AES-128-GCM.
        /// </summary>
        public readonly bool EncAlgoAes128Gcm;
        /// <summary>
        /// Allow algorithm AES-256-CBC.
        /// </summary>
        public readonly bool EncAlgoAes256Cbc;
        /// <summary>
        /// Allow algorithm AES-256-GCM.
        /// </summary>
        public readonly bool EncAlgoAes256Gcm;
        /// <summary>
        /// Allow algorithm RC4.
        /// </summary>
        public readonly bool EncAlgoRc4;
        /// <summary>
        /// Allow algorithm DHE.
        /// </summary>
        public readonly bool KeyxchgAlgoDhe;
        /// <summary>
        /// Allow algorithm ECDHE.
        /// </summary>
        public readonly bool KeyxchgAlgoEcdhe;
        /// <summary>
        /// Allow algorithm RSA.
        /// </summary>
        public readonly bool KeyxchgAlgoRsa;
        /// <summary>
        /// The MaxVersion param. String must be one of these: `"tls1-0"`, `"tls1-1"`, `"tls1-2"`, `"tls1-3"`, `"max"`. Default: `"max"`.
        /// </summary>
        public readonly string MaxVersion;
        /// <summary>
        /// The MinVersion param. String must be one of these: `"tls1-0"`, `"tls1-1"`, `"tls1-2"`. Default: `"tls1-0"`.
        /// </summary>
        public readonly string MinVersion;

        [OutputConstructor]
        private GetTlsServiceProfileProtocolSettingsResult(
            bool authAlgoSha1,

            bool authAlgoSha256,

            bool authAlgoSha384,

            bool encAlgo3des,

            bool encAlgoAes128Cbc,

            bool encAlgoAes128Gcm,

            bool encAlgoAes256Cbc,

            bool encAlgoAes256Gcm,

            bool encAlgoRc4,

            bool keyxchgAlgoDhe,

            bool keyxchgAlgoEcdhe,

            bool keyxchgAlgoRsa,

            string maxVersion,

            string minVersion)
        {
            AuthAlgoSha1 = authAlgoSha1;
            AuthAlgoSha256 = authAlgoSha256;
            AuthAlgoSha384 = authAlgoSha384;
            EncAlgo3des = encAlgo3des;
            EncAlgoAes128Cbc = encAlgoAes128Cbc;
            EncAlgoAes128Gcm = encAlgoAes128Gcm;
            EncAlgoAes256Cbc = encAlgoAes256Cbc;
            EncAlgoAes256Gcm = encAlgoAes256Gcm;
            EncAlgoRc4 = encAlgoRc4;
            KeyxchgAlgoDhe = keyxchgAlgoDhe;
            KeyxchgAlgoEcdhe = keyxchgAlgoEcdhe;
            KeyxchgAlgoRsa = keyxchgAlgoRsa;
            MaxVersion = maxVersion;
            MinVersion = minVersion;
        }
    }
}
